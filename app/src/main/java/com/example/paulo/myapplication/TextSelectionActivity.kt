package com.example.paulo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.text.Editable
import android.util.Log
import kotlinx.android.synthetic.main.activity_text_selection.*


class TextSelectionActivity : AppCompatActivity() {
//    companion object {
//        fun onCreateA(){
//            Callback aae : Call
//            Callback mActionModeCallback = new Callback {
//
//                // Called when the action mode is created; startActionMode() was called
//                @Override
//                public boolean onCreateActionMode(ActionMode mode, Menu menu) {
//                    // Inflate a menu resource providing context menu items
//                    MenuInflater inflater = mode.getMenuInflater()
//                    inflater.inflate(R.menu.context_menu, menu)
//                    return true
//                }
//
//                // Called each time the action mode is shown. Always called after onCreateActionMode, but
//                // may be called multiple times if the mode is invalidated.
//                @Override
//                public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
//                    return false // Return false if nothing is done
//                }
//
//                // Called when the user selects a contextual menu item
//                @Override
//                public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
//                    switch (item.getItemId()) {
//                        case R.id.menu_share:
//                        shareCurrentItem()
//                        mode.finish() // Action picked, so close the CAB
//                        return true
//                        default:
//                        return false
//                    }
//                }
//
//                // Called when the user exits the action mode
//                @Override
//                public void onDestroyActionMode(ActionMode mode) {
//                    mActionMode = null
//                }
//            }
//        }
//
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        val result = createProcessTextIntent()
//        setContentView(R.layout.activity_text_selection)
//        getDelegate().setHandleNativeActionModesEnabled(false)
//        result.dataString
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_selection)
        progressBar.progress = 0
        val text = intent
                .getCharSequenceExtra(Intent.EXTRA_PROCESS_TEXT)
        // process the text
        // here we have highlighted text
        inputText1.setText(text.toString())
        textView2.text = text

        button.setOnClickListener{
            progressBar.incrementProgressBy(5)
            progressBar.progress = 100
            inputText1.setText("Succcess!")
        }

    }

    private fun createProcessTextIntent(): Intent {
        return Intent()
                .setAction(Intent.ACTION_PROCESS_TEXT)
                .setType("text/plain")
    }
}