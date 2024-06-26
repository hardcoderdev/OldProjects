package spiral.bit.dev.moodvoice.other

import android.Manifest
import android.content.Context
import pub.devrel.easypermissions.EasyPermissions

//Это утилитный файл, здесь будут храниться фразочки, например.

class Utils {
    companion object {
        var questions = arrayListOf(
            "Как тебе спалось?",
            "Как тебе погода сегодня?",
            "Как твоё самочувствие?",
            "Ты покушал? Что у тебя было/ будет на завтрак?",
            "Какие у тебя утренние ритуалы?",
            "Что ты планируешь сегодня делать?",
            "Сегодня абсолютно свободный день. Что бы ты делал?",
            "Как ты провел(а) вчерашний вечер?",
            "Какой для тебя отдых мечты?",
            "Что ты собираешься надеть на работу/учёбу?",
            "С кем собираешься провести этот день?",
            "Что бы ты хотел(а) сегодня на завтрак?",
            "Что приятного произошло с тобой вчера?",
            "Что ты собираешься приготовить на ужин?",
            "Назови ТОП своих любимых фруктов.",
            "Назови свои любимые цвета.",
            "Назови свои любимые вкусняшки.",
            "Что бы ты поменял(а) в своём жилье?"
        )

        fun hasPermissions(context: Context) =
            EasyPermissions.hasPermissions(
                context,
                Manifest.permission.RECORD_AUDIO,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            )

        val predictionsList = arrayListOf(
            "Днём будь настолько добрым к окружающим тебя людям, насколько готов себе это позволить.",
            "Вечером устрой себе маленький праздник, но с гостями и вкусными угощениями.",
            "Посвяти день самообразованию, сегодня есть шанс узнать больше, чем за весь месяц.",
            "Сегодня хороший день, чтобы копошиться по дому: звук пылесоса поможет унять тревогу.",
            "Отыщи в комоде что-нибудь блестящее и попробуй вписать его в повседневный гардероб.",
            "Закончи этот день максимально приятно. Например, принимая ванну с бокалом вина.",
            "От души и с улыбкой проживи этот день генерируя в себе больше любви, нежности и доброты.",
            "Пожалуй самый лучший день для романтического свидания или семейного обеда.",
            "Проведи этот день максимально активно и ярко, в обществе интересных людей.",
            "Чудо произойдёт очень скоро. Осталось поверить очень сильно.",
            "Откажись от мытья посуды после завтрака и займись поиском себя, а заботы подождут до завтра.",
            "Не отказывай сегодня себе ни в еде, ни в алкоголе, если хочется.",
            "Удели сегодня время искусству. Сходи на выставку или в театр.",
            "Постарайся сегодня оставаться улыбчивым и в меру приятным человеком.",
            "Хороший день, чтобы отказаться от сахара или алкоголя.",
            "Сегодня просто будь сладкой конфеткой)",
            "Инструкция на день: не надо быть good, надо быть great)",
            "Честно? День шикарный, но ты шикарней:)",
            "На тебя движется туча счастья. Польёт будь здоров. В данном случае зонт тебе не понадобится.",
            "Классный день, потому что ты классный!"
        )

        val goodMotivations = arrayListOf(
            "У тебя сегодня все как по маслу, не забудь поделиться позитивом с другими!",
            "Не смотри на косые взгляды, танцуй на ходу, тебе же это нравится!",
            "Солнце светит, птички поют – спой и ты!",
            "Тебе сегодня можно всё!",
            "Не надо стесняться!"
        )

        val neutralMotivations = arrayListOf(
            "Пора за покупочками!",
            "Ты как ясное солнышко!",
            "Купи себе мороженку, ты заслужил(а).",
            "Миллионы, миллионы алых роз … и все тебе!",
            "Ты сегодня просто пЭрсык!"
        )

        val sadnessMotivations = arrayListOf(
            "Ты невозмутим как удав, используй это",
            "Не жди чуда – будь чудом!",
            "Счастье близко, просто обернись.",
            "Релакс – это твое, не сдерживай себя!",
            "Кайфуй. Спокойно, размеренно, тебе сегодня это по плечу."
        )

        val fearMotivations = arrayListOf(
            "Если поводов для радости вокруг маловато – сделай их сам!",
            "Завари чайку, поставь всех на игнор, сегодня время восстановиться.",
            "Не отказывай себе в маленьких подарочках, я разрешаю)",
            "Укрыться одеялом и дрыхнуть весь день? О, да, позволь себе это!",
            "Все достали? Время претвориться камешком."
        )

        val angryMotivations = arrayListOf(
            "Побереги людей, посиди дома с котиком под боком.",
            "Сегодня подходящий день все-таки записаться на секцию бокса.",
            "Хочется брызгать ядом? Делай это тонко, сойдешь за сатирика)",
            "Спорт тебе сегодня жизненно необходим, от негатива нужно избавляться",
            "Хочешь кричать? Ни слова больше, собирайся мы сегодня идем в караоке!"
        )
    }
}