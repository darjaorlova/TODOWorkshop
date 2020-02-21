package lt.workshop.todo


object Database {
    private val tasks: MutableList<Task> = mutableListOf()

    fun add(task: Task) {
        tasks.add(task)
    }

    fun get(): List<Task> {
        return tasks.toList()
    }

}