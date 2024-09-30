import EmployeeCard from '../employee-cards/EmployeeCard.jsx'
import {employees} from '../../../data.js'

function EmployeesContainer()
{
    return (
        <main className="container mt-4 employees-container" id="employees-container">
            {
            employees.map((employee) => (
                <EmployeeCard id={employee.employeeId} firstName={employee.firstName}
                lastName={employee.lastName} jobTitle={employee.title} /> ))
            }
        </main>
    )
}
export default EmployeesContainer