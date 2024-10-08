package com.digitalsamura.vmfmapper

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
public fun main() {
    ComposeViewport(document.body!!) {
        App()
    }
}