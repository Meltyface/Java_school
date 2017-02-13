package AsciiTask;

import java.util.ArrayList;
import java.util.List;

public class MultiLCDDigit extends LCDDigit {
    
    private static final LCDDigit[] SINGLE_DIGITS = {
        new LCDZero(), new LCDOne(), new LCDTwo(), new LCDThree(), new LCDFour(),
        new LCDFive(), new LCDSix(), new LCDSeven(), new LCDEight(), new LCDNine()
    };

    private List<LCDDigit> individualDigits = new ArrayList<>();
    
    public MultiLCDDigit(int i) {
        calculateDigit(i);
        appendRows();
    }

    private void calculateDigit(int i) {
        if(i >= 10)
            calculateDigit(i / 10);
        individualDigits.add(SINGLE_DIGITS[i % 10]);
    }

    private void appendRows() {
        for (LCDDigit digit : individualDigits)
            appendRow(digit);
    }

    private void appendRow(LCDDigit digit) {
        firstRow += digit.firstRow;
        secondRow += digit.secondRow;
        thirdRow += digit.thirdRow;
    }
}

abstract class LCDDigit {
    protected String firstRow = "";
    protected String secondRow= "";
    protected String thirdRow = "";

    @Override
    public String toString(){
        return firstRow + "\n" + secondRow + "\n" + thirdRow;
    }
}

class LCDZero extends LCDDigit {
    public LCDZero(){
        firstRow = " _ ";
        secondRow= "| |";
        thirdRow = "|_|";
    } 
}

class LCDOne extends LCDDigit {
    LCDOne() {
        firstRow = "   ";
        secondRow= "  |";
        thirdRow = "  |";
    }
}

class LCDTwo extends LCDDigit {
    LCDTwo() {
        firstRow = " _ ";
        secondRow= " _|";
        thirdRow = "|_ ";
    }
}

class LCDThree extends LCDDigit {
    LCDThree() {
        firstRow = " _ ";
        secondRow= " _|";
        thirdRow = " _|";
    }
}

class LCDFour extends LCDDigit {
    LCDFour() {
        firstRow = "   ";
        secondRow= "|_|";
        thirdRow = "  |";
    }
}

class LCDFive extends LCDDigit {
    LCDFive() {
        firstRow = " _ ";
        secondRow= "|_ ";
        thirdRow = " _|";
    }
}

class LCDSix extends LCDDigit {
    LCDSix() {
        firstRow = " _ ";
        secondRow= "|_ ";
        thirdRow = "|_|";
    }
}

class LCDSeven extends LCDDigit {
    LCDSeven() {
        firstRow = " _ ";
        secondRow= "  |";
        thirdRow = "  |";
    }
}

class LCDEight extends LCDDigit {
    LCDEight() {
        firstRow = " _ ";
        secondRow= "|_|";
        thirdRow = "|_|";
    }
}

class LCDNine extends LCDDigit {
    LCDNine() {
        firstRow = " _ ";
        secondRow= "|_|";
        thirdRow = " _|";
    }
}
