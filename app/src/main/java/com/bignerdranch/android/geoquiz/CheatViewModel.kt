package com.bignerdranch.android.geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel
import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import com.bignerdranch.android.geoquiz.databinding.ActivityCheatBinding
import androidx.activity.result.contract.ActivityResultContracts

private const val TAG = "CheatViewModel"

class CheatViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {}
