import './EmployeeCard.css'

function EmployeeCard(props)
{
    const imagePath = `images/employees/${props.id}.webp`

    return (
        <div className="employee-row">
            <img id="employee-image" src={imagePath} />
            <div className="employee-name">
                <h1>{props.firstName} {props.lastName}</h1>
                <h6>{props.jobTitle}</h6>
            </div>
        </div>
    )
}
export default EmployeeCard