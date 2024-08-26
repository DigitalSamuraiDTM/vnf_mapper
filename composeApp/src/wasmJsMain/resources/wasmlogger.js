function WasmLogger() {}
WasmLogger.i = function(message) {
    console.info(message)
}
WasmLogger.d = function(message) {
    console.log(message)
}
WasmLogger.e = function(message) {
    console.error(message)
}
WasmLogger.w = function(message) {
    console.warn(message)
}