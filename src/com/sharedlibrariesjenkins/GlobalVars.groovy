#!/usr/bin/env groovy
package com.sharedlibrariesjenkins

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.sharedlibrariesjenkins.GlobalVars
   // println GlobalVars.foo
}
