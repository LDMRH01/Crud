package com.lramirez.crud_equipo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listaClientes: MutableList<dtperfe> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaClientes.add(
            dtperfe("1","Dior","Precio Alto $5000","Precio Bajo $3000","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/Miss-Dior-absolutely-blooming-Perfumes-originales-decants-muestras-fragancias-fiord-confiable-.png?alt=media&token=cf653be1-46ca-438e-9cda-f33b099fc761"))
        listaClientes.add(
            dtperfe("2","Ariana Grande","Precio Alto $1200","Precio Bajo $1000","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/2.png?alt=media&token=6bf0d3e9-d95d-4e6c-9c18-3205683f2316"))
        listaClientes.add(
            dtperfe("3","Versace","Precio Bajo $1900","Precio Bajo $1200","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/3.png?alt=media&token=8c86b429-e3b5-4fc3-8180-ae9e4a373127"))
        listaClientes.add(
            dtperfe("4","Victoria Secret","Precio Bajo $2000","Precio Bajo $1000","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/4.png?alt=media&token=7c2499c7-410b-4b5e-a275-6f9800aefca4"))
        listaClientes.add(
            dtperfe("5","Nautica","Precio Bajo $700","Precio Bajo $200","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/5.jfif?alt=media&token=72c77b7c-d21a-4612-8efa-78d700250616"))
        listaClientes.add(
            dtperfe("6","Paco Rabanne ","Precio Bajo $00","Precio Bajo $1000","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/6.png?alt=media&token=c24302d1-2752-4927-a25b-c5821c49b783"))
        listaClientes.add(
            dtperfe("7","Paco Rabanne Pure Xs","Precio $000","Precio Bajo $1000","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/7.png?alt=media&token=d5a9e9b4-9fa2-4b48-b7e7-8ece2a3df84d"))
        listaClientes.add(
            dtperfe("8","One millon","Precio Bajo $000","Precio Bajo $1000","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/8.png?alt=media&token=a5aa6369-7ea2-4672-b8f5-7ab93e0c1a76"))
        listaClientes.add(
            dtperfe("9","One millon lucky","Precio Bajo $000","Precio Bajo $1000","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/9.jfif?alt=media&token=fc5e9bdd-b0d6-40e5-86e0-e68b1707c829"))
        listaClientes.add(
            dtperfe("10","One millon parfum","Precio Alto $3000","Precio Bajo $2600","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/10.png?alt=media&token=d993b7b3-8fcf-4fb2-880f-a95800d1d2ea"))
        listaClientes.add(
            dtperfe("11","One millon elixir","Precio Alto $3800","Precio Bajo $2500","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/11.jfif?alt=media&token=c5ada42b-13d2-49eb-9d96-bdd4eb79c8a6"))
        listaClientes.add(
            dtperfe("12","Antonio Banderas","Precio Alto $1000","Precio Bajo $800","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/12.jfif?alt=media&token=51366995-ff47-4c0b-a009-a1af13b67164"))
        listaClientes.add(
            dtperfe("13","Calvin Klein","Precio Alto $2000","Precio Bajo $1000","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/13.png?alt=media&token=5ace40d5-6494-4b1a-9915-9b76f7f5d5d7"))
        listaClientes.add(
            dtperfe("14","Jean Pual Guiltier","Precio Alto $4000","Precio Bajo $3100","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/14.png?alt=media&token=35c34e23-35cc-4b2e-9f70-e97a62b3cca1"))
        listaClientes.add(
            dtperfe("15","Jean Pual Guiltier le male","Precio Alto $4000","Precio Bajo $3100","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/15.png?alt=media&token=fb42a454-7cf8-4b07-977f-058c09620deb"))
        listaClientes.add(
            dtperfe("16","Jean Pual Guiltier Le Male Parfum","Precio Alto $4500","Precio Bajo $3100","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/16.jfif?alt=media&token=2be0afd9-5ba8-4d57-8782-5cd387bada45"))
        listaClientes.add(
            dtperfe("17","Jean Pual Guiltier Elixir","Precio Alto $3900","Precio Bajo $3100","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/17.jfif?alt=media&token=471a93dc-6d84-4b86-9053-bee23639cc17"))
        listaClientes.add(
            dtperfe("18","Jean Pual Guiltier Ultramale","Precio Alto $4600","Precio Bajo $3100","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/18.jfif?alt=media&token=8603e70b-3bf0-466c-9b1a-ea536a919ed5"))
        listaClientes.add(
            dtperfe("19","Versace Dylan Blue","Precio Alto $4900","Precio Bajo $3100","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/19.png?alt=media&token=d00407a1-6d26-4884-b33d-ba0d66fa1411"))
        listaClientes.add(
            dtperfe("20","Paco Rabanne Pure Xs Black","Precio Alto $3000","Precio Bajo $2500","https://firebasestorage.googleapis.com/v0/b/perfume-45655.appspot.com/o/20.jfif?alt=media&token=728ff2e1-40d3-411c-93a3-7a808187ff76"))
        var tabla = findViewById<RecyclerView>(R.id.tablaClientes)
        recycler=tabla
        recycler.layoutManager= LinearLayoutManager(this)
        recycler.adapter=clienteAdapter(this,listaClientes)

    }
}