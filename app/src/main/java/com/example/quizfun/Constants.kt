package com.example.quizfun

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1,"Em O Império Contra-Ataca, qual a frase correta dita " +
                "por Darth Vader ao revelar a verdade a Luke?",R.drawable.question_one, "" +
                "Luke, eu sou seu pai", "Nao, eu sou seu pai", "Eu sou seu pai",
        "Eu sou sua mãe", 2)

        questionList.add(que1)

        val que2 = Question(2,"Quantas formas de comunicação estão contidas na memória de C3PO?",
        R.drawable.question_two,"10 milhões", "8 milhões",
            "12 milhões","6 milhões",2)
        questionList.add(que2)

        val que3 = Question(3,"Há quanto tempo Yoda diz que treina cavaleiros Jedi?",
        R.drawable.ioda,"900 anos","500 anos", "800 anos",
            "1000 anos",3)
        questionList.add(que3)
        return questionList
    }
}