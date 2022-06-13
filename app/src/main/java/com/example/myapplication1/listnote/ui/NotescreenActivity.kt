package com.example.myapplication1.listnote.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication1.R
 import com.example.myapplication1.databinding.ListNoteBinding
import com.example.myapplication1.databinding.LayotNoteScreenBinding
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import android.view.View
import android.view.LayoutInflater



 class NotescreenActivity: AppCompatActivity() {
    private lateinit var binding:LayotNoteScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayotNoteScreenBinding.inflate(layoutInflater)
        setContentView(R.layout.layot_note_screen)
    }

     class TodoListActivity : Fragment() {
         private lateinit var binding: LayotNoteScreenBinding
         override fun onCreateView(
             inflater: LayoutInflater,
             container: ViewGroup?,
             savedInstanceState: Bundle?
         ): View? {
         }
         }


}