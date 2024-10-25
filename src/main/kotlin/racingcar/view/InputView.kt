package racingcar.view

import camp.nextstep.edu.missionutils.Console

class InputView {

    fun getRacingCarNames(): List<String> {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")

        val input = Console.readLine().trim()
        checkInputIsEmpty(input)

        val carNames = input.split(",")
        validateCarNameLength(carNames)
        validateCarNameDuplicate(carNames)

        return carNames
    }

    private fun checkInputIsEmpty(input: String) {
        if (input.isEmpty()) throw IllegalArgumentException(INVALID_INPUT_EMPTY)
    }

    private fun validateCarNameLength(carNames: List<String>) {
        carNames.forEach { carName -> if (carName.length > 5 || carName.isEmpty()) throw IllegalArgumentException(INVALID_INPUT_CAR_NAME_LENGTH) }
    }

    private fun validateCarNameDuplicate(carNames: List<String>) {
        if(carNames.size != carNames.distinct().size) throw IllegalArgumentException(INVALID_INPUT_CAR_NAME_DUPLICATE)
    }

    companion object {
        const val INVALID_INPUT_EMPTY = "입력이 필요합니다."
        const val INVALID_INPUT_CAR_NAME_LENGTH = "자동차 이름의 길이가 유효하지 않습니다."
        const val INVALID_INPUT_CAR_NAME_DUPLICATE = "중복된 자동차 이름이 존재합니다."
    }
}