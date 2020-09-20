package com.example.l4s_skill_realm

import io.realm.RealmObject

open class Memo (
    open var title: String = "",
    open var content: String = ""
    ): RealmObject()