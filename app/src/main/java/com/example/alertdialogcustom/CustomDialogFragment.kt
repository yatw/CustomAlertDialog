package com.example.alertdialogcustom

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class CustomDialogFragment(context: Context) : DialogFragment() {

    private val builder: MaterialAlertDialogBuilder = MaterialAlertDialogBuilder(context)

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        builder.setTitle("Custom Dialog")
        builder.setMessage("content")
        builder.setPositiveButton("OK", object: DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {

            }
        })
        builder.setView(R.layout.layout_image)
        return builder.create()
    }
}