package com.example.retrofitwithkotlin

data class QuoteList(
    val count: Int?=0,
    val lastItemIndex: Int?=0,
    val page: Int?=0,
    val results: List<Result>,
    val totalCount: Int?=0,
    val totalPages: Int?=0
)