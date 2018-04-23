package rambostudio.com.listadapter

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by Rambo on 1/01/2018.
 */
class SurveyStationGalleryRecyclerAdapter{
//    : ListAdapter<SurveyStationGalleryModel,
//        SurveyStationGalleryViewHolder>(SurveyStationGalleryDiffCallback())  {
//
//    override fun onBindViewHolder(holder: SurveyStationGalleryViewHolder, position: Int) {
//        val data = getItem(position)
//        holder.bindData(data, onItemClickListener)
//    }
//
//    var onItemClickListener: ((item: SurveyStationGalleryModel) -> Unit)? = null
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SurveyStationGalleryViewHolder {
//
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_survey_station_gallery,
//                parent, false)
//        return SurveyStationGalleryViewHolder(view)
//
//    }
//
//    class SurveyStationGalleryDiffCallback : DiffUtil.ItemCallback<SurveyStationGalleryModel>() {
//        override fun areItemsTheSame(oldItem: SurveyStationGalleryModel, newItem: SurveyStationGalleryModel): Boolean {
//            return oldItem.id == newItem.id
//        }
//
//        override fun areContentsTheSame(oldItem: SurveyStationGalleryModel, newItem: SurveyStationGalleryModel): Boolean {
//            return oldItem.name == newItem.name
//
//        }
//
//    }
}