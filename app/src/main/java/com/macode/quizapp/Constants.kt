package com.macode.quizapp

object Constants {
    val countryQuestion = "What country does this flag belong to?"

    fun getCountryQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            countryQuestion,
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1)

        val que2 = Question(
            1,
            countryQuestion,
            R.drawable.ic_flag_of_australia,
            "Liechtenstein",
            "Australia",
            "Serbia",
            "Austria",
            2)

        val que3 = Question(
            1,
            countryQuestion,
            R.drawable.ic_flag_of_belgium,
            "Andorra",
            "Belgium",
            "Russia",
            "Serbia",
            2)

        val que4 = Question(
            1,
            countryQuestion,
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Mexico",
            "Chile",
            "Bolivia",
            1)

        val que5 = Question(
            1,
            countryQuestion,
            R.drawable.ic_flag_of_denmark,
            "Switzerland",
            "Austria",
            "Denmark",
            "Poland",
            3)

        val que6 = Question(
            1,
            countryQuestion,
            R.drawable.ic_flag_of_fiji,
            "San Marino",
            "Australia",
            "Papua New Guinea",
            "Fiji",
            4)

        val que7 = Question(
            1,
            countryQuestion,
            R.drawable.ic_flag_of_germany,
            "Germany",
            "Romania",
            "Belgium",
            "Cyprus",
            1)

        val que8 = Question(
            1,
            countryQuestion,
            R.drawable.ic_flag_of_india,
            "Philippines",
            "Iran",
            "Vietnam",
            "India",
            4)

        val que9 = Question(
            1,
            countryQuestion,
            R.drawable.ic_flag_of_kuwait,
            "Jordan",
            "Palestine",
            "Kuwait",
            "Oman",
            3)

        val que10 = Question(
            1,
            countryQuestion,
            R.drawable.ic_flag_of_new_zealand,
            "Australia",
            "New Zealand",
            "Japan",
            "Malaysia",
            2)

        questionList.add(que1)
        return questionList
    }
}