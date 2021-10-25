package com.example.alertdialogcustom

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder


/*
    add view on Framelayout call "custom" directly
 */
class CustomDialogFragment3(context: Context) : DialogFragment() {

    private val builder: MaterialAlertDialogBuilder = MaterialAlertDialogBuilder(context)

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        builder.setTitle("Custom Dialog")
        builder.setMessage("content")
        builder.setPositiveButton("OK", object: DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
            }
        })

        val fl: FrameLayout = this.requireView().findViewById(android.R.id.custom)

        val inflater = requireContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val myView = inflater.inflate(R.layout.layout_image, fl, false)
        fl.addView(myView, ViewGroup.LayoutParams(MATCH_PARENT, WRAP_CONTENT))
        return builder.create()
    }

}