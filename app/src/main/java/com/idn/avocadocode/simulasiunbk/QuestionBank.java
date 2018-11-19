package com.idn.avocadocode.simulasiunbk;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Pada layar televisi, panjang sebuah mobil adalah 14 cm dan tingginya 4 cm. Jika tinggi sebenarnya adalah 1 m, maka panjang mobil sebenarnya adalah... ",
            "2. Sebuah kaleng berbentuk tabung berjari-jari 5 cm mempunyai tinggi 20 cm. Luas kaleng tersebut adalah... ",
            "3. Sebuah tangki air berbentuk tabung dengan jari – jari 60 cm dan tinggi 1,4 m akan diisi air sampai penuh. Banyaknya air yang mengisi tangki adalah …liter",
            "4. Syarat dua bangun datar dikatakan sebangun apabila:" +
                    "(i) Sudut – sudut yang bersesuaian sama besar, " +
                    "(ii) Sisi – sisi yang bersesuaian mempunyai perbandingan yang sama, " +
                    "(iii) Memiliki luas bangun yang sama besar, " +
                    "(iv) Memiliki keliling yang sama besar. " +
                    "Pernyataan yang benar ditunjukkan oleh…",
            "5. Volume kerucut yang berdiameter 12 cm dan panjang garis pelukisnya 10 cm adalah... "
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"3m", "3,5m", "4m", "4,5m"},
            {"700 cm2", "750cm", "780cm2", "785cm2"},
            {"1.864 Liter", "1.584 Liter", "1.684 Liter", "1.464 Liter"},
            {"(i) dan (iii)", "(ii) dan (iii)", "(i) dan (ii)", "(i) dan (iv)"},
            {"501,44 cm3", "402,33 cm3", "301,44 cm3", "202,33 cm3"}
    };

    private String mCorrectAnswers[] = {"3,5m", "785cm2", "1.584 Liter", "(i) dan (ii)", "301,44 cm3"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}