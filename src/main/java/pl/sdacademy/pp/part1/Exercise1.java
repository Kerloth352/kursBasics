package pl.sdacademy.pp.part1;

class Exercise1 {


    public boolean isPrimeNumber(int inputNumber) {
        if (inputNumber < 2){
            return false;
        } else {
            for (int it = 2; it <= inputNumber; it++) {
                if (inputNumber % it == 0) {
                    if (inputNumber == it){
                        return true;
                    }else return false;
                }
            }
            return true;
        }

    }
}
