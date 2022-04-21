package com.example.modul4.data

import android.content.Context
import com.example.modul4.R


class Data(private val context: Context) {
    fun loadOddSemester(): List<Subject> {
        return listOf(
            Subject(context.getString(R.string.programing_concept),
                "Ir. Muhammad Alkaff S.Kom., M.Kom.",
                3,
                "Monday, 10.30 AM"
                ),
            Subject(context.getString(R.string.web_programing_concept),
                "Eka Setya Wijaya, S.T., M.Kom",
                3,
                "Tueday, 01.30 PM"
                ),
            Subject(context.getString(R.string.algebra),
                "Juhriyansyah Dalle, Ph.D",
                2,
                "Wednesday, 8.00 AM"
                ),
            Subject(context.getString(R.string.calculus),
                "Juhriyansyah Dalle, Ph.D",
                2,
                "Wednesday, 10.30 AM"
            ),
            Subject(context.getString(R.string.pancasila),
                "Sri Ratnawati S.Pd., M.Pd.",
                2,
                "Thursday, 10.30 AM"
            )
        )
    }

    fun loadEvenSemester(): List<Subject> {
        return listOf(
            Subject(context.getString(R.string.object_oriented_programing),
                "Andreyan Rizky Baskara, S.Kom., M.Kom",
                3,
                "Monday, 10.30 AM"
            ),
            Subject(context.getString(R.string.web_design),
                "Andreyan Rizky Baskara, S.Kom., M.Kom",
                3,
                "Tueday, 01.30 PM"
            ),
            Subject(context.getString(R.string.human_computer_interaction),
                "Juhriyansyah Dalle, Ph.D",
                2,
                "Wednesday, 8.00 AM"
            ),
            Subject(context.getString(R.string.query_data_structured),
                "Nurul Fathanah Mustamin, S.Pd., M.T.",
                2,
                "Thursday, 10.30 AM"
            ),
            Subject(context.getString(R.string.artificial_intelligent),
                "Yuslena Sari, S.Kom., M.Kom.",
                2,
                "Friday, 10.30 AM"
            )
        )
    }

    fun loadOptionalSubject(): List<Subject> {
        return listOf(
            Subject(context.getString(R.string.data_warehouse_data_mining),
                "Nurul Fathanah Mustamin, S.Pd., M.T.",
                2,
                "Monday, 10.30 AM"
            ),
            Subject(context.getString(R.string.mobile_programing),
                "Andreyan Rizky Baskara, S.Kom., M.Kom",
                3,
                "Tueday, 01.30 PM"
            ),
            Subject(context.getString(R.string.web_application_security),
                "Eka Setya Wijaya, S.T., M.Kom",
                2,
                "Wednesday, 8.00 AM"
            ),
            Subject(context.getString(R.string.web_framework),
                "Ir. Muhammad Alkaff S.Kom., M.Kom.",
                3,
                "Wednesday, 10.30 AM"
            ),
            Subject(context.getString(R.string.audit_it),
                "Nurul Fathanah Mustamin, S.Pd., M.T.",
                2,
                "Wednesday, 01.30 PM"
            )
        )
    }

}