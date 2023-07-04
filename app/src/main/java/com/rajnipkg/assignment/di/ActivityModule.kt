package com.rajnipkg.assignment.di

import com.rajnipkg.assignment.PhotoActivity
import org.koin.core.qualifier.named
import org.koin.dsl.module

val activitymodule= module {
    scope<PhotoActivity> {
        scoped(qualifier = named("hello")) { "Hello" }
        scoped(qualifier = named("bye")) { "Bye" }
    }
}


