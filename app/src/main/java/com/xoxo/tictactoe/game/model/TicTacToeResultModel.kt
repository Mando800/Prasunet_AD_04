package com.xoxo.tictactoe.game.model

import androidx.annotation.IdRes
import androidx.annotation.StringRes

data class TicTacToeResultModel(
    @StringRes val nameId: Int,
    @IdRes val winnerId: Int?
)