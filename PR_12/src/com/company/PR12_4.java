package com.company;

class PhoneNumber {
    private String phoneNumber;
    //+7928-238-1502
    public PhoneNumber(String number) {
        StringBuffer stringBuffer = new StringBuffer(number);
        if (stringBuffer.charAt(0) == '8') {
            phoneNumber = "+" + 8 + stringBuffer.substring(1, 4) + "-" + stringBuffer.substring(4, 7) + "-" + stringBuffer.substring(7, 11);
        } else
            phoneNumber = "+" + stringBuffer.substring(1, 5) + "-" + stringBuffer.substring(5, 8) + "-" + stringBuffer.substring(8, 12);
    }

    @Override
    public String toString() {
        return phoneNumber;
    }
}

public class PR12_4 {
    public static void main(String[] args) {
    PhoneNumber number1 = new PhoneNumber("+19282381502");
    PhoneNumber number2 = new PhoneNumber("89282381502");
    System.out.println(number1);
    System.out.println(number2);
    }
}
