package com.example.indepthrecyclerview.nestedrv.data.repository

import com.example.indepthrecyclerview.linearrv.data.model.User
import com.example.indepthrecyclerview.nestedrv.data.model.UserWithSubject
import com.example.indepthrecyclerview.nestedrv.data.model.UserWithSubject.Subject

object UserWithSubjectFakeRepository {

    private var subjectList = listOf(

        Subject(1, "Subject1", "https://picsum.photos/id/211/200/300"),
        Subject(3, "Subject3", "https://picsum.photos/id/212/200/300"),
        Subject(4, "Subject4", "https://picsum.photos/id/213/200/300"),
        Subject(2, "Subject2", "https://picsum.photos/id/214/200/300"),
        Subject(5, "Subject6", "https://picsum.photos/id/215/200/300"),
        Subject(5, "Subject7", "https://picsum.photos/id/216/200/300"),
        Subject(5, "Subject8", "https://picsum.photos/id/217/200/300"),
        Subject(5, "Subject9", "https://picsum.photos/id/218/200/300"),
        Subject(5, "Subject10", "https://picsum.photos/id/219/200/300"),
        Subject(5, "Subject11", "https://picsum.photos/id/220/200/300"),
        Subject(5, "Subject12", "https://picsum.photos/id/221/200/300"),
        Subject(5, "Subject13", "https://picsum.photos/id/222/200/300"),
        Subject(5, "Subject14", "https://picsum.photos/id/223/200/300"),
        Subject(5, "Subject15", "https://picsum.photos/id/224/200/300"),
        Subject(5, "Subject16", "https://picsum.photos/id/225/200/300"),
        Subject(5, "Subject17", "https://picsum.photos/id/226/200/300"),
        Subject(5, "Subject18", "https://picsum.photos/id/227/200/300"),
        Subject(5, "Subject19", "https://picsum.photos/id/228/200/300"),
        Subject(5, "Subject20", "https://picsum.photos/id/229/200/300"),
        Subject(5, "Subject21", "https://picsum.photos/id/201/200/300"),
        Subject(5, "Subject22", "https://picsum.photos/id/202/200/300"),
        Subject(5, "Subject23", "https://picsum.photos/id/203/200/300"),
        Subject(5, "Subject24", "https://picsum.photos/id/230/200/300"),
        Subject(5, "Subject25", "https://picsum.photos/id/231/200/300"),
        Subject(5, "Subject26", "https://picsum.photos/id/232/200/300"),
        Subject(5, "Subject28", "https://picsum.photos/id/233/200/300"),
        Subject(5, "Subject29", "https://picsum.photos/id/234/200/300"),
        Subject(5, "Subject29", "https://picsum.photos/id/235/200/300"),
        Subject(5, "Subject29", "https://picsum.photos/id/236/200/300"),
        Subject(5, "Subject30", "https://picsum.photos/id/238/200/300"),
        Subject(5, "Subject31", "https://picsum.photos/id/239/200/300"),
        Subject(5, "Subject32", "https://picsum.photos/id/240/200/300"),
        Subject(5, "Subject33", "https://picsum.photos/id/241/200/300"),
        Subject(5, "Subject34", "https://picsum.photos/id/242/200/300"),
        Subject(5, "Subject35", "https://picsum.photos/id/243/200/300"),
        Subject(5, "Subject36", "https://picsum.photos/id/244/200/300"),
    )

    val userWithSubjectList = listOf(
        UserWithSubject(1, User(1, "Vijay", 22), subjectList),
        UserWithSubject(2, User(2, "Ravi", 22), subjectList),
        UserWithSubject(3, User(3, "Nikhil", 22), subjectList),
        UserWithSubject(4, User(4, "Ronaldo", 22), subjectList),
        UserWithSubject(5, User(5, "Vishnu", 22), subjectList),
        UserWithSubject(6, User(6, "Jerry", 22), subjectList),
        UserWithSubject(7, User(7, "Tom", 22), subjectList),
        UserWithSubject(8, User(9, "Krishna", 22), subjectList),
    )

}

