package es.jfechevarria.ktutils.extensions

import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils

fun View.animView(anim: Int, listener: Animation.AnimationListener? = null){
    val animation = AnimationUtils.loadAnimation(this.context, anim)
    animation.setAnimationListener(listener)
    startAnimation(animation)
}