package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var isNewOp=true
    var oldNumber=""
    var op="?"
    lateinit var buclick:String
//    private lateinit var ed:EditText
//    private lateinit var bu1:Button
//    private lateinit var bu2:Button
//    private lateinit var bu3:Button
//    private lateinit var bu4:Button
//    private lateinit var bu5:Button
//    private lateinit var bu6:Button
//    private lateinit var bu7:Button
//    private lateinit var bu8:Button
//    private lateinit var bu9:Button
//    private lateinit var bu0:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buclick=""

    }

    fun numberEvent(view: View) {
        if (isNewOp)
            ed.setText("")
        isNewOp=false
         buclick=ed.text.toString()
        val buselect:Button=view as Button
//
        when(buselect.id){
            bu1.id ->{buclick += "1"}
            bu2.id ->{buclick += "2"}
            bu3.id -> {buclick += "3"}
            bu4.id -> {buclick += "4"}
            bu5.id -> {buclick += "5"}
            bu6.id -> {buclick += "6"}
            bu7.id -> {buclick += "7"}
            bu8.id -> {buclick += "8"}
            bu9.id -> {buclick += "9"}
            bu0.id -> {buclick += "0"}
//            buDot.id ->{buclick+="."}
            buPlusMinus.id ->{buclick+="-$buclick"}



        }
        ed.setText(buclick)
    }

    fun operatorEvent(view: View) {
        isNewOp=true
        oldNumber=ed.text.toString()
        var buselect:Button=view as Button

//        Toast.makeText(this, buMultiply.id.toString(), Toast.LENGTH_SHORT).show()

        when(buselect.id)
        {

            buMultiply.id->{op="*"}
            buDiv.id->{op="/"}
            buPlus.id->{op="+"}
            buMinus.id->{op="-"}
            //Toast.makeText(this, "added", Toast.LENGTH_SHORT).show()


        }
        ed.setText(op)
//        Toast.makeText(this,ed.text.toString(), Toast.LENGTH_SHORT).show()

    }

    fun equalEvent(view: View) {
//        Log.e("yo","hi")
//            Toast.makeText(this,op.toString(), Toast.LENGTH_SHORT).show()

        var newnumber:String=ed.text.toString()
        var result=0.0
        when(op)
        {
             "+" ->{result=oldNumber.toDouble()+newnumber.toDouble()}
            "-" ->{result=oldNumber.toDouble()-newnumber.toDouble()}
            "*" ->{result=oldNumber.toDouble()*newnumber.toDouble()}
            "/" ->{result=oldNumber.toDouble()/newnumber.toDouble()}
        }
        ed.setText(result.toString())
    }

    fun ACevent(view: View) {
        ed.setText("")
        isNewOp=true
    }

    fun percentEvent(view: View) {
        var no:String= (ed.text.toString().toDouble()/100).toString()
        ed.setText(no)
        isNewOp=true
    }

    fun dotEvent(view: View) {
         val buselect:Button=view as Button
        var x=ed.text.toString()
        if(x.contains("." )&& op=="?")
        {
            buclick+=""
        }
        else if(x.contains("." )&& op=="+")
        {
            buclick+=""
        }
        else if(x.contains("." )&& op=="-")
        {
            buclick+=""
        }
        else if(x.contains("." )&& op=="*")
        {
            buclick+=""
        }
        else if(x.contains("." )&& op=="/")
        {
            buclick+=""
        }
        else
        {
            when(buselect.id){
                buDot.id->{buclick+="."}
            }
            ed.setText(buclick)
        }

    }

    fun plusEvent(view: View) {}
    fun plusMinusEvent(view: View) {
        val buselect:Button=view as Button
        var value:String
//        value="-" + value
    }

    fun backEvent(view: View) {
        var str:String
        str=ed.text.toString()
        if(str.length >=1)
        {
            str=str.substring(0,str.length -1)
            ed.setText(str)
        }

    }



}



