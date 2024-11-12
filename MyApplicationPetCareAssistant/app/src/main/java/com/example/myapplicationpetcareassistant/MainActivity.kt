package com.example.myapplicationpetcareassistant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // 加载 XML 布局文件

        // 初始化 RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.petRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PetAdapter(listOf("Pet 1", "Pet 2", "Pet 3"))

        // 添加宠物按钮的点击事件
        val addButton = findViewById<FloatingActionButton>(R.id.addPetButton)
        addButton.setOnClickListener {
            // 跳转到添加宠物页面
            val intent = Intent(this, AddPetActivity::class.java)
            startActivity(intent)
        }
    }
}

