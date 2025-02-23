// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.ReadonlyArray
import kotlin.js.Promise

@JsName("restoreCache")
external fun restoreCacheAsync(
    paths: ReadonlyArray<String>,
    primaryKey: String,
    restoreKeys: ReadonlyArray<String> = definedExternally,
    options: DownloadOptions = definedExternally,
    enableCrossOsArchive: Boolean = definedExternally,
): Promise<String?>
