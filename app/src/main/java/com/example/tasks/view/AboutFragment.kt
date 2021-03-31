package com.example.tasks.view

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tasks.R

class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root =  inflater.inflate(R.layout.fragment_about, container, false)
        setupHyperlink(root)
        return root
    }

    private fun setupHyperlink(root: View) {
        val linkTextView = root.findViewById<TextView>(R.id.link_github)
        val linkTextView2 = root.findViewById<TextView>(R.id.link_linkedin)
        val linkTextView3 = root.findViewById<TextView>(R.id.link_whatsapp)
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());
    }


}