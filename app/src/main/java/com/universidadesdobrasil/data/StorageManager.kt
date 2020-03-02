package com.universidadesdobrasil.data

import android.util.Log
import java.io.File

class StorageManager {
    companion object {
        fun clearApplicationData(cacheDir: File) {
            val cache: File = cacheDir
            val appDir = File(cache.getParent())
            if (appDir.exists()) {
                val children: Array<String> = appDir.list()
                for (s in children) {
                    if (s != "lib") {
                        deleteDir(
                            File(appDir, s)
                        )
                        Log.i(
                            "TAG",
                            "**************** File /data/data/APP_PACKAGE/$s DELETED *******************"
                        )
                    }
                }
            }
        }

        fun deleteDir(dir: File?): Boolean {
            if (dir != null && dir.isDirectory()) {
                val children: Array<String> = dir.list()
                for (i in children.indices) {
                    val success =
                        deleteDir(
                            File(dir, children[i])
                        )
                    if (!success) {
                        return false
                    }
                }
            }
            return dir!!.delete()
        }
    }
}