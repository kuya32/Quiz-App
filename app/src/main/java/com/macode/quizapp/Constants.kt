package com.macode.quizapp

object Constants {
    private const val countryQuestion = "What country does this flag belong to?"
    private const val animeQuestion = "Who is this anime character?"

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
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)

        return questionList
    }

    fun getAnimeQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            animeQuestion,
            R.drawable.ic_luffy,
            "Saitama",
            "Tamari",
            "Ichigo",
            "Luffy",
            4)

        val que2 = Question(
            1,
            animeQuestion,
            R.drawable.ic_ichigo,
            "Orochimaru",
            "Ichigo",
            "Dabi",
            "Boa Hancock",
            2)

        val que3 = Question(
            1,
            animeQuestion,
            R.drawable.ic_goku,
            "Goku",
            "Hisoka",
            "Minato",
            "Sebastian",
            1)

        val que4 = Question(
            1,
            animeQuestion,
            R.drawable.ic_naruto,
            "Sinbad",
            "Hashirma",
            "Naruto",
            "Renji",
            3)

        val que5 = Question(
            1,
            animeQuestion,
            R.drawable.ic_saitama,
            "Shanks",
            "Might Guy",
            "Saitama",
            "Gajeel",
            3)

        val que6 = Question(
            1,
            animeQuestion,
            R.drawable.ic_obito,
            "Obito",
            "InuYasha",
            "Sasori",
            "Vegeta",
            1)

        val que7 = Question(
            1,
            animeQuestion,
            R.drawable.ic_alphonse,
            "Garra",
            "Edward",
            "Kurapika",
            "Alphonse",
            4)

        val que8 = Question(
            1,
            animeQuestion,
            R.drawable.ic_erwin,
            "Kenpachi",
            "Erwin",
            "Levi",
            "Aizen",
            2)

        val que9 = Question(
            1,
            animeQuestion,
            R.drawable.ic_mugen,
            "Killer Bee",
            "Zabuza",
            "Mugen",
            "Guts",
            3)

        val que10 = Question(
            1,
            animeQuestion,
            R.drawable.ic_rachel,
            "A bitch",
            "A thot",
            "Trash",
            "Rachel",
            4)

        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)

        return questionList
    }

    fun getNFLQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "",
            R.drawable.ic_flag_of_new_zealand,
            "Saitama",
            "Tamari",
            "Ichigo",
            "Luffy",
            4)

        return questionList
    }
}