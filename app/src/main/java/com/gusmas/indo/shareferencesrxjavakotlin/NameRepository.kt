package com.gusmas.indo.shareferencesrxjavakotlin

import io.reactivex.Completable
import io.reactivex.Observable

interface NameRepository {

    fun savaName(name:String):Completable

    fun name(): Observable<String>

    fun clear():Completable

}