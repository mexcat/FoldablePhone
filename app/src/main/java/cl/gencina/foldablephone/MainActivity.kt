package cl.gencina.foldablephone


open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    fun switchOff() {
        isScreenLightOn = false
    }
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean):Phone(isScreenLightOn){
    private var isFold: Boolean = false
    override fun switchOn(){
        if(!isFold){
            isScreenLightOn = true
        }
    }
    fun foldOpen(){
        isFold = true
    }
    fun foldClose(){
        isFold = false
    }
}

