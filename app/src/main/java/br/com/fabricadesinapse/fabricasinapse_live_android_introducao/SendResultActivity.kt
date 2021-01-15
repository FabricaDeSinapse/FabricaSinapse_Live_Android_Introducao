package br.com.fabricadesinapse.fabricasinapse_live_android_introducao

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SendResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_result)

        val btYes = findViewById<Button>(R.id.btYes)
        val btNo = findViewById<Button>(R.id.btNo)
        val btCancel = findViewById<Button>(R.id.btCancel)

        btYes.setOnClickListener {
            val intent = Intent()

            intent.putExtra("RESULT", getString(R.string.yes))

            setResult(Activity.RESULT_OK, intent)

            finish()
        }

        btNo.setOnClickListener {
            val intent = Intent()

            intent.putExtra("RESULT", getString(R.string.no))

            setResult(Activity.RESULT_OK, intent)

            finish()
        }

        btCancel.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)

            finish()
        }
    }
}
