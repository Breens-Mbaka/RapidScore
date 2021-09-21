package com.swift.swiftscore.util

import java.text.SimpleDateFormat
import java.util.*

class Constants {
    companion object {
        const val BASE_URL = "https://app.sportdataapi.com/"

        const val BASE_URL2 = "https://www.thesportsdb.com/"

        //PL = Premier League this will be for the league table
        const val PL_ID_TABLE = "4328"

        const val LIGUE_1_ID_TABLE = "4334"

        const val PL_SEASON = "2021-2022"

        //PL = Premier League this will be for upcoming matches
        const val PL_ID_MATCHES = "1980"
        const val LIGUE1_ID_MATCHES = "2022"

        //Get user current date according to their location
        val CURRENT_DATE = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            .format(Date())

        //Premier League Matchdays
        const val MATCHDAY_1_START_DATE = "2021-08-13"
        const val MATCHDAY_1_FROM_DATE = "2021-08-15"


        const val MATCHDAY_2_START_DATE = "2021-08-21"
        const val MATCHDAY_2_FROM_DATE = "2021-08-23"

        const val MATCHDAY_3_START_DATE = "2021-08-28"
        const val MATCHDAY_3_FROM_DATE = "2021-08-29"

        const val MATCHDAY_4_START_DATE = "2021-09-11"
        const val MATCHDAY_4_FROM_DATE = "2021-09-13"

        const val MATCHDAY_5_START_DATE = "2021-09-17"
        const val MATCHDAY_5_FROM_DATE = "2021-09-19"

        const val MATCHDAY_6_START_DATE = "2021-09-25"
        const val MATCHDAY_6_FROM_DATE = "2021-09-27"

        const val MATCHDAY_7_START_DATE = "2021-10-02"
        const val MATCHDAY_7_FROM_DATE = "2021-10-03"

        const val MATCHDAY_8_START_DATE = "2021-10-16"
        const val MATCHDAY_8_FROM_DATE = "2021-10-18"

        const val MATCHDAY_9_START_DATE = "2021-10-22"
        const val MATCHDAY_9_FROM_DATE = "2021-10-24"

        const val MATCHDAY_10_START_DATE = "2021-10-30"
        const val MATCHDAY_10_FROM_DATE = "2021-11-01"

        const val MATCHDAY_11_START_DATE = "2021-11-06"
        const val MATCHDAY_11_FROM_DATE = "2021-11-07"

        const val MATCHDAY_12_START_DATE = "2021-11-20"
        const val MATCHDAY_12_FROM_DATE = "2021-11-21"

        const val MATCHDAY_13_START_DATE = "2021-11-27"
        const val MATCHDAY_13_FROM_DATE = "2021-11-28"

        const val MATCHDAY_14_START_DATE = "2021-11-30"
        const val MATCHDAY_14_FROM_DATE = "2021-12-01"

        const val MATCHDAY_15_START_DATE = "2021-12-04"
        const val MATCHDAY_15_FROM_DATE = "2021-12-05"

        const val MATCHDAY_16_START_DATE = "2021-12-11"
        const val MATCHDAY_16_FROM_DATE = "2021-12-12"

        const val MATCHDAY_17_START_DATE = "2021-12-14"
        const val MATCHDAY_17_FROM_DATE = "2021-12-15"

        const val MATCHDAY_18_START_DATE = "2021-12-18"
        const val MATCHDAY_18_FROM_DATE = "2021-12-19"

        const val MATCHDAY_19_START_DATE = "2021-12-26"
        const val MATCHDAY_19_FROM_DATE = "2021-12-27"

        const val MATCHDAY_20_START_DATE = "2021-12-28"
        const val MATCHDAY_20_FROM_DATE = "2021-12-29"

        const val MATCHDAY_21_START_DATE = "2022-01-01"
        const val MATCHDAY_21_FROM_DATE = "2022-01-02"

        const val MATCHDAY_22_START_DATE = "2022-01-02"
        const val MATCHDAY_22_FROM_DATE = "2022-01-03"

        const val MATCHDAY_23_START_DATE = "2022-01-22"
        const val MATCHDAY_23_FROM_DATE = "2022-01-23"

        const val MATCHDAY_24_START_DATE = "2022-02-08"
        const val MATCHDAY_24_FROM_DATE = "2022-02-09"

        const val MATCHDAY_25_START_DATE = "2022-02-12"
        const val MATCHDAY_25_FROM_DATE = "2022-02-13"

        const val MATCHDAY_26_START_DATE = "2022-02-19"
        const val MATCHDAY_26_FROM_DATE = "2022-02-20"

        const val MATCHDAY_27_START_DATE = "2022-02-26"
        const val MATCHDAY_27_FROM_DATE = "2022-02-27"

        const val MATCHDAY_28_START_DATE = "2022-03-05"
        const val MATCHDAY_28_FROM_DATE = "2022-03-06"

        const val MATCHDAY_29_START_DATE = "2022-03-12"
        const val MATCHDAY_29_FROM_DATE = "2022-03-13"

        const val MATCHDAY_30_START_DATE = "2022-03-19"
        const val MATCHDAY_30_FROM_DATE = "2022-03-20"

        const val MATCHDAY_31_START_DATE = "2022-04-02"
        const val MATCHDAY_31_FROM_DATE = "2022-04-03"

        const val MATCHDAY_32_START_DATE = "2022-04-09"
        const val MATCHDAY_32_FROM_DATE = "2022-04-10"

        const val MATCHDAY_33_START_DATE = "2022-04-16"
        const val MATCHDAY_33_FROM_DATE = "2022-04-17"

        const val MATCHDAY_34_START_DATE = "2022-04-23"
        const val MATCHDAY_34_FROM_DATE = "2022-04-24"

        const val MATCHDAY_35_START_DATE = "2022-04-30"
        const val MATCHDAY_35_FROM_DATE = "2022-04-31"

        const val MATCHDAY_36_START_DATE = "2022-05-07"
        const val MATCHDAY_36_FROM_DATE = "2022-05-08"

        const val MATCHDAY_37_START_DATE = "2022-05-15"
        const val MATCHDAY_37_FROM_DATE = "2022-05-16"

        const val MATCHDAY_38_START_DATE = "2022-05-22"
        const val MATCHDAY_38_FROM_DATE = "2022-05-23"


        //Ligue1 Matchdays
        const val MATCHDAY_1_START_DATE_LIGUE1 = "2021-08-06"
        const val MATCHDAY_1_FROM_DATE_LIGUE1 = "2021-08-08"

        const val MATCHDAY_2_START_DATE_LIGUE1 = "2021-08-13"
        const val MATCHDAY_2_FROM_DATE_LIGUE1 = "2021-08-15"

        const val MATCHDAY_3_START_DATE_LIGUE1 = "2021-08-20"
        const val MATCHDAY_3_FROM_DATE_LIGUE1 = "2021-08-22"

        const val MATCHDAY_4_START_DATE_LIGUE1 = "2021-08-27"
        const val MATCHDAY_4_FROM_DATE_LIGUE1 = "2021-08-29"

        const val MATCHDAY_5_START_DATE_LIGUE1 = "2021-09-10"
        const val MATCHDAY_5_FROM_DATE_LIGUE1 = "2021-09-12"

        const val MATCHDAY_6_START_DATE_LIGUE1 = "2021-09-17"
        const val MATCHDAY_6_FROM_DATE_LIGUE1 = "2021-09-19"

        const val MATCHDAY_7_START_DATE_LIGUE1 = "2021-09-22"
        const val MATCHDAY_7_FROM_DATE_LIGUE1 = "2021-09-23"

        const val MATCHDAY_8_START_DATE_LIGUE1 = "2021-09-25"
        const val MATCHDAY_8_FROM_DATE_LIGUE1 = "2021-09-26"

        const val MATCHDAY_9_START_DATE_LIGUE1 = "2021-10-01"
        const val MATCHDAY_9_FROM_DATE_LIGUE1 = "2021-10-03"

        const val MATCHDAY_10_START_DATE_LIGUE1 = "2021-10-15"
        const val MATCHDAY_10_FROM_DATE_LIGUE1 = "2021-10-17"

        const val MATCHDAY_11_START_DATE_LIGUE1 = "2021-10-24"
        const val MATCHDAY_11_FROM_DATE_LIGUE1 = "2021-10-28"

        const val MATCHDAY_12_START_DATE_LIGUE1 = "2021-10-31"
        const val MATCHDAY_12_FROM_DATE_LIGUE1 = "2021-11-01"

        const val MATCHDAY_13_START_DATE_LIGUE1 = "2021-11-07"
        const val MATCHDAY_13_FROM_DATE_LIGUE1 = "2021-11-08"

        const val MATCHDAY_14_START_DATE_LIGUE1 = "2021-11-21"
        const val MATCHDAY_14_FROM_DATE_LIGUE1 = "2021-11-22"

        const val MATCHDAY_15_START_DATE_LIGUE1 = "2021-11-28"
        const val MATCHDAY_15_FROM_DATE_LIGUE1 = "2021-12-01"

        const val MATCHDAY_16_START_DATE_LIGUE1 = "2021-12-01"
        const val MATCHDAY_16_FROM_DATE_LIGUE1 = "2021-12-02"

        const val MATCHDAY_17_START_DATE_LIGUE1 = "2021-12-05"
        const val MATCHDAY_17_FROM_DATE_LIGUE1 = "2021-12-06"

        const val MATCHDAY_18_START_DATE_LIGUE1 = "2021-12-12"
        const val MATCHDAY_18_FROM_DATE_LIGUE1 = "2021-12-13"

        const val MATCHDAY_19_START_DATE_LIGUE1 = "2021-12-22"
        const val MATCHDAY_19_FROM_DATE_LIGUE1 = "2021-12-23"

        const val MATCHDAY_20_START_DATE_LIGUE1 = "2022-01-09"
        const val MATCHDAY_20_FROM_DATE_LIGUE1 = "2022-01-10"

        const val MATCHDAY_21_START_DATE_LIGUE1 = "2022-01-16"
        const val MATCHDAY_21_FROM_DATE_LIGUE1 = "2022-01-17"

        const val MATCHDAY_22_START_DATE_LIGUE1 = "2022-01-23"
        const val MATCHDAY_22_FROM_DATE_LIGUE1 = "2022-01-24"

        const val MATCHDAY_23_START_DATE_LIGUE1 = "2022-02-06"
        const val MATCHDAY_23_FROM_DATE_LIGUE1 = "2022-02-07"

        const val MATCHDAY_24_START_DATE_LIGUE1 = "2022-02-13"
        const val MATCHDAY_24_FROM_DATE_LIGUE1 = "2022-02-14"

        const val MATCHDAY_25_START_DATE_LIGUE1 = "2022-02-20"
        const val MATCHDAY_25_FROM_DATE_LIGUE1 = "2022-02-21"

        const val MATCHDAY_26_START_DATE_LIGUE1 = "2022-02-27"
        const val MATCHDAY_26_FROM_DATE_LIGUE1 = "2022-02-28"

        const val MATCHDAY_27_START_DATE_LIGUE1 = "2022-03-06"
        const val MATCHDAY_27_FROM_DATE_LIGUE1 = "2022-03-07"

        const val MATCHDAY_28_START_DATE_LIGUE1 = "2022-03-13"
        const val MATCHDAY_28_FROM_DATE_LIGUE1 = "2022-03-14"

        const val MATCHDAY_29_START_DATE_LIGUE1 = "2022-03-20"
        const val MATCHDAY_29_FROM_DATE_LIGUE1 = "2022-03-21"

        const val MATCHDAY_30_START_DATE_LIGUE1 = "2022-04-03"
        const val MATCHDAY_30_FROM_DATE_LIGUE1 = "2022-04-04"

        const val MATCHDAY_31_START_DATE_LIGUE1 = "2022-04-10"
        const val MATCHDAY_31_FROM_DATE_LIGUE1 = "2022-04-11"

        const val MATCHDAY_32_START_DATE_LIGUE1 = "2022-04-17"
        const val MATCHDAY_32_FROM_DATE_LIGUE1 = "2022-04-18"

        const val MATCHDAY_33_START_DATE_LIGUE1 = "2022-04-20"
        const val MATCHDAY_33_FROM_DATE_LIGUE1 = "2022-04-21"

        const val MATCHDAY_34_START_DATE_LIGUE1 = "2022-04-24"
        const val MATCHDAY_34_FROM_DATE_LIGUE1 = "2022-04-25"

        const val MATCHDAY_35_START_DATE_LIGUE1 = "2022-05-01"
        const val MATCHDAY_35_FROM_DATE_LIGUE1 = "2022-05-02"

        const val MATCHDAY_36_START_DATE_LIGUE1 = "2022-05-08"
        const val MATCHDAY_36_FROM_DATE_LIGUE1 = "2022-05-09"

        const val MATCHDAY_37_START_DATE_LIGUE1 = "2022-05-14"
        const val MATCHDAY_37_FROM_DATE_LIGUE1 = "2022-05-15"

        const val MATCHDAY_38_START_DATE_LIGUE1 = "2022-05-21"
        const val MATCHDAY_38_FROM_DATE_LIGUE1 = "2022-05-22"
    }
}