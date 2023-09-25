import React, { ButtonHTMLAttributes } from 'react';
import './LargeButton.scss';
import classNames from 'classnames';
import LargeButtonColor from 'constants/color';

interface BottomBtnProps extends ButtonHTMLAttributes<HTMLButtonElement> {
	value?: string;
	buttonColor?: LargeButtonColor;
	buttonClick: () => void;
}

interface ImgProps {
	imgsrc: string;
}

function LargeButton({ value, buttonColor, buttonClick, imgsrc }: BottomBtnProps & ImgProps) {
	return (
		<button type="button" onClick={buttonClick} className={classNames('button-value', buttonColor)}>
			{imgsrc && imgsrc.length > 0 && <img className="img-size" src={imgsrc} alt="" />}
			{value}
		</button>
	);
}

export default LargeButton;

LargeButton.defaultProps = {
	value: '',
	buttonColor: LargeButtonColor.Green,
};