package com.dfp

import io.vlingo.actors.Stoppable

interface Ponger: Stoppable {

    fun pong(pinger: Pinger)
}