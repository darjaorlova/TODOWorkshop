package lt.workshop.todo

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_task.view.*

class TaskViewHolder(view: View): RecyclerView.ViewHolder(view) {
    fun bind(task: Task) {
        itemView.task_text.text = task.text
    }
}