package academy.learnprogramming.buttonclickapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    /*initializing these variables as null starting out, the below widgets don't exist yet since we haven't set the
     content view. First, we set them to null by default, then once the program recognizes the widgets, we'll reassign them to
     the proper variable. */
    private var userInput : EditText? = null
    private var button: Button? = null
    private var textView : TextView? = null
    private var numTimesClicks = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInput = findViewById<EditText>(R.id.editText)
        button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()

        button?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                numTimesClicks += 1
                textView?.append("\nThe button got tapped $numTimesClicks time")
                if (numTimesClicks != 1) {
                    textView?.append("s")
                }
            }
        })
    }
}
