package kfd

fun displayName(name: String?): String = if (name.isNullOrBlank()) "Гость" else name.trim()
