package es.jfechevarria.ktutils.extensions

import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import es.jfechevarria.ktutils.global.GlobalActivity

inline fun <reified T : ViewModel> GlobalActivity.viewModel(body: T.() -> Unit): T {
    val vm = ViewModelProviders.of(this)[T::class.java]
    vm.body()
    return vm
}

inline fun <reified T : ViewModel> DialogFragment.viewModel(body: T.() -> Unit): T {
    val vm = ViewModelProviders.of(this)[T::class.java]
    vm.body()
    return vm
}