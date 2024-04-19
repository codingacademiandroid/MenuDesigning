package com.mani.menudesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnMenu : Button
    lateinit var toolbar: Toolbar
    lateinit var tvName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.toolbar)
        btnMenu = findViewById(R.id.btnMenu)
        tvName = findViewById(R.id.tvName)
        registerForContextMenu(tvName)

        btnMenu.setOnClickListener(this)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {

            R.id.Save -> {

                Toast.makeText(this,"I am Clicking on Save Option",Toast.LENGTH_SHORT).show()
            }

            R.id.Call -> {

                Toast.makeText(this,"I am Clicking on Call Option",Toast.LENGTH_SHORT).show()
            }

            R.id.Camera -> {

                Toast.makeText(this,"I am Clicking on Camera Option",Toast.LENGTH_SHORT).show()
            }

            R.id.Edit -> {

                Toast.makeText(this,"I am Clicking on Edit Option",Toast.LENGTH_SHORT).show()
            }


        }


        return super.onOptionsItemSelected(item)
    }

    override fun onClick(p0: View?) {

        val popupMenu = PopupMenu(this,btnMenu)
        popupMenu.menuInflater.inflate(R.menu.main_menu,popupMenu.menu)

        popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
            when(item.itemId) {

                R.id.Save -> {

                    Toast.makeText(this,"I am Clicking on Save Option",Toast.LENGTH_SHORT).show()
                }

                R.id.Call -> {

                    Toast.makeText(this,"I am Clicking on Call Option",Toast.LENGTH_SHORT).show()
                }

                R.id.Camera -> {

                    Toast.makeText(this,"I am Clicking on Camera Option",Toast.LENGTH_SHORT).show()
                }

                R.id.Edit -> {

                    Toast.makeText(this,"I am Clicking on Edit Option",Toast.LENGTH_SHORT).show()
                }


            }
            true
        })


        popupMenu.show()

    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        menuInflater.inflate(R.menu.main_menu,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {

            R.id.Save -> {

                Toast.makeText(this, "I am Clicking on Save Option", Toast.LENGTH_SHORT).show()
            }

            R.id.Call -> {

                Toast.makeText(this, "I am Clicking on Call Option", Toast.LENGTH_SHORT).show()
            }

            R.id.Camera -> {

                Toast.makeText(this, "I am Clicking on Camera Option", Toast.LENGTH_SHORT).show()
            }

            R.id.Edit -> {

                Toast.makeText(this, "I am Clicking on Edit Option", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}