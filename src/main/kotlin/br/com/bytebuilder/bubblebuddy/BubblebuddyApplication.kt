package br.com.bytebuilder.bubblebuddy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BubblebuddyApplication

fun main(args: Array<String>) {
	runApplication<BubblebuddyApplication>(*args)
}
