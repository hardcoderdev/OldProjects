package spiral.bit.dev.lgbtswipe.views.msgs_views

data class ViewVoiceMsg(
    override val id: String,
    override val from: String,
    override val timeStamp: String,
    override val fileUrl: String,
    override val text: String = ""
): MessageView {
    override fun getTypeView(): Int {
        return MessageView.MESSAGE_VOICE
    }

    override fun equals(other: Any?): Boolean {
        return (other as MessageView).id == id
    }
}