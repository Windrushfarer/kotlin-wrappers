// Automatically generated - do not modify!

package actions.io

import kotlinx.coroutines.await

suspend fun which(
    tool: String,
): String =
    whichAsync(
        tool = tool,
    ).await()

suspend fun which(
    tool: String,
    check: Boolean,
): String =
    whichAsync(
        tool = tool,
        check = check,
    ).await()
