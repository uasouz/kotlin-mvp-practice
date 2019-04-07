package com.example.mvptest.login.presenter

import com.example.mvptest.login.model.LoginInteractor
import com.example.mvptest.login.view.LoginActivity

class LoginPresenter(private val view: LoginActivity?, private val model: LoginInteractor) {

    fun doLogin(username: String,password:String){

    }

}