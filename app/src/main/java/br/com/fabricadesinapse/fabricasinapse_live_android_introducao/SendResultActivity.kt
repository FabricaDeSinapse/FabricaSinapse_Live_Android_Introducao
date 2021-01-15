package br.com.fabricadesinapse.fabricasinapse_live_android_introducao

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity

class SendResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_result)

        val btYes = findViewById<Button>(R.id.btYes)
        val btNo = findViewById<Button>(R.id.btNo)
        val btCancel = findViewById<Button>(R.id.btCancel)

        btYes.setOnClickListener {
            sendResult(R.string.yes)
        }

        btNo.setOnClickListener {
            sendResult(R.string.no)
        }

        btCancel.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)

            finish()
        }
    }

    private fun sendResult(@StringRes stringResId: Int) {
        val intent = Intent()

        intent.putExtra("RESULT", getString(stringResId))

        setResult(Activity.RESULT_OK, intent)

        finish()
    }
}
