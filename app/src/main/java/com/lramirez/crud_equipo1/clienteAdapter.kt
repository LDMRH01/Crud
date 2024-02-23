package com.lramirez.crud_equipo1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class clienteAdapter(var context: Context,
                     var ListaClientes: MutableList<dtperfe>) :
    RecyclerView.Adapter<clienteAdapter.vHolder>()
{


        inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            lateinit var txtid: TextView
            init {
                txtid=itemView.findViewById(R.id.txtid)
            }

            lateinit var txtperfume: TextView
            init{
                txtperfume=itemView.findViewById(R.id.txtPerfume)
            }
            lateinit var txtprecioa: TextView
            init{
                txtprecioa=itemView.findViewById(R.id.txtprecioa)
            }
            lateinit var txtpreciob: TextView
            init{
                txtpreciob=itemView.findViewById(R.id.txtPreciob)
            }
            lateinit var txtimagen: ImageView
            init{
                txtimagen=itemView.findViewById(R.id.imagen)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): clienteAdapter.vHolder {
            var itemView = LayoutInflater.from(context).inflate(
                R.layout.vistaper,parent,false)
            return vHolder(itemView)
        }
        override fun getItemCount(): Int {
            return ListaClientes.size
        }
        override fun onBindViewHolder(holder: clienteAdapter.vHolder, position: Int) {
            var clientes = ListaClientes[position]
            holder.txtid.text=clientes.id
            holder.txtperfume.text=clientes.Perfume
            holder.txtprecioa.text=clientes.Precioa
            holder.txtpreciob.text=clientes.Preciob
            Picasso.get().load(clientes.url).into(holder.txtimagen)
        }


    }