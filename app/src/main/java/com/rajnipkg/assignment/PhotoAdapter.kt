package com.rajnipkg.assignment

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rajnipkg.assignment.databinding.PhotoItemsBinding
import com.squareup.picasso.Picasso

class PhotoAdapter(private val photos: List<DtPhoto>) : RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PhotoItemsBinding.inflate(inflater, parent, false)
        return PhotoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val photo = photos[position]
        holder.bind(photo)
    }

    override fun getItemCount(): Int {
        Log.i("tot pic",photos.size.toString())
        return photos.size
    }
    inner class PhotoViewHolder(private val binding: PhotoItemsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(photo: DtPhoto) {

            binding.titleTextView.text = photo.title.toString()
            Picasso.get().load(photo.thumbnailUrl).into(binding.photoImageView)

        }
    }

}
