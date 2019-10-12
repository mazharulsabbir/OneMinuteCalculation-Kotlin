package edu.wonder.youth.math.game.ui.activity

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import edu.wonder.youth.math.game.R
import edu.wonder.youth.math.game.utils.Maths

class PlayActivity : AppCompatActivity() {

    private val maths: Maths = Maths()
    private lateinit var btn1: MaterialButton
    private lateinit var btn2: MaterialButton
    private lateinit var btn3: MaterialButton
    private lateinit var btn4: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val textViewQuestionShow1: TextView = findViewById(R.id.tv_ques_show1)
        val textViewQuestionShow2: TextView = findViewById(R.id.tv_ques_show2)
        val textViewArithmeticSign: TextView = findViewById(R.id.tv_arithmetic_sign)

        textViewQuestionShow1.text = maths.number1(100).toString()
        textViewQuestionShow2.text = maths.number2(50).toString()
        textViewArithmeticSign.text = "+"

        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener {
            it.setBackgroundColor(Color.RED)
            nextQuestion()
        }

        btn2 = findViewById(R.id.btn2)
        btn2.setOnClickListener {
            it.setBackgroundColor(Color.RED)

            nextQuestion()
        }

        btn3 = findViewById(R.id.btn3)
        btn3.setOnClickListener {
            it.setBackgroundColor(Color.RED)

            nextQuestion()
        }

        btn4 = findViewById(R.id.btn4)
        btn4.setOnClickListener {
            it.setBackgroundColor(Color.RED)

            nextQuestion()
        }
    }

    private fun nextQuestion() {
        val textViewQuestionShow1: TextView = findViewById(R.id.tv_ques_show1)
        val textViewQuestionShow2: TextView = findViewById(R.id.tv_ques_show2)

        var n1 = maths.number1(100).toString()
        var n2 = maths.number2(50).toString()
        var n3 = maths.number3(50).toString()
        var n4 = maths.number4(50).toString()

        btn1.text = n1
        btn2.text = n2
        btn3.text = n3
        btn4.text = n4

        textViewQuestionShow1.text = n1
        textViewQuestionShow2.text = n2

        resetButtonColor()
    }

    private fun resetButtonColor() {
        btn1.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        btn2.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        btn3.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        btn4.setBackgroundColor(resources.getColor(R.color.colorPrimary))
    }
}
