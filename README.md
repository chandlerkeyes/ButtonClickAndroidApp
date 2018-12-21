# ButtonClickAndroidApp

This app was designed to learn the fundamentals of the Activity Lifecycle.

Throughout the making of this app, I took user's input through an EditText widget and displayed what they entered in a TextView widget.
This is useful if you want to make a TODO list app or a Shopping List app. 

Making sure that the app maintains the contents in the TextView when the app pauses, destroys, or stops, requires using Androids
activity lifecycle methods to save the state in a bundle using key/value pairs (the key being a String and value being textview.text).

We save the state the contents of the text view using onSaveInstanceState and we restore it using onRestoreInstanceState
